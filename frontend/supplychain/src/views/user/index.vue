<template>
  <div class="app-container">
    <div class="user-info">
      <el-collapse v-model="activeNames">
        <el-collapse-item title="用户名" name="1">
          <div>{{ userData.nameOnWebase }}</div>
        </el-collapse-item>
        <el-collapse-item title="姓名" name="2">
          <div>{{ userData.orgName }}</div>
        </el-collapse-item>
        <el-collapse-item title="描述" name="3">
          <div>{{ userData.orgDescription }}</div>
        </el-collapse-item>
        <el-collapse-item title="余额" name="4">
          <div style="color:red;font-weight:blod;font-size:16px">
            {{ userData.balance / 100 }}
          </div>
        </el-collapse-item>
      </el-collapse>
    </div>
  </div>
</template>

<script>
import { getUser } from "@/api/table";
import { getUserId } from "@/utils/auth";

export default {
  data() {
    return {
      userData: {},
      activeNames: ["1", "2", "3", "4"]
    };
  },
  created() {
    this.getUserInfo();
  },
  methods: {
    getUserInfo() {
      const id = getUserId();
      getUser(id).then(res => {
        this.userData = res.data;
      });
    }
  }
};
</script>

<style lang="scss">
.el-collapse {
  font-size: 16px;
}
</style>
