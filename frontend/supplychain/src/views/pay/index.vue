<template>
  <div class="app-container">
    <el-form
      ref="form"
      :model="form"
      :rules="amountRules"
      label-width="120px"
      class="form-box"
    >
      <el-form-item label="链路选择">
        <el-select v-model="form.chainId" placeholder="链路选择">
          <el-option
            v-for="item in signData"
            :label="item.title"
            :value="item.chainId"
            :key="item.chainId"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="支付金额" prop="totalAmount">
        <el-input v-model="form.totalAmount" />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitPayInfo('form')"
          >提交</el-button
        >
        <el-button @click="goBack">返回</el-button>
      </el-form-item>
    </el-form>
    <el-dialog title="支付成功" :visible.sync="dialogPayVisible">
      <el-table :data="payData">
        <el-table-column property="txHash" label="交易地址"></el-table-column>
        <el-table-column label="支付对象及金额" width="200">
          <template slot-scope="scope"
            >{{ scope.row.orgName }}:<b>{{
              scope.row.amount / 100
            }}</b></template
          ></el-table-column
        >
        <el-table-column label="余额">
          <template slot-scope="scope"
            >{{ scope.row.orgName }}:<b>{{
              scope.row.balance / 100
            }}</b></template
          ></el-table-column
        >
      </el-table>
    </el-dialog>
  </div>
</template>
<script>
import { getSignInfo, toPay } from "@/api/table";
import { getUserId } from "@/utils/auth";
export default {
  data() {
    const validAmount = (rule, value, callback) => {
      const reg = /^\d+(\.\d{1,2})?$/;
      if (!reg.test(value)) {
        callback(new Error("请输入正确的金额"));
      } else {
        callback();
      }
    };
    return {
      payData: [],
      dialogPayVisible: false,
      amountRules: {
        totalAmount: [
          { required: true, message: "请输入金额", trigger: "blur" },
          { validator: validAmount, trigger: "blur" }
        ]
      },
      signData: [],
      form: {
        chainId: "",
        totalAmount: ""
      }
    };
  },
  created() {
    this.getSignData();
  },
  methods: {
    goBack() {
      this.$router.push({ path: "/list" });
    },
    getSignData() {
      const id = getUserId();
      getSignInfo(id).then(res => {
        this.signData = res.data;
        this.form.chainId = this.signData[0].chainId;
      });
    },
    submitPayInfo(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
        }
      });
      const params = {
        chainId: this.form.chainId,
        totalAmount: this.form.totalAmount * 100
      };

      toPay(params).then(res => {
        if (res.code === 0) {
          this.payData = res.data;
          this.dialogPayVisible = true;
        }
      });
    }
  }
};
</script>

<style lang="scss" scoped>
.el-select {
  width: 100%;
}
.form-box {
  width: 40%;
}
</style>
