import request from "@/utils/request";

export function login(data) {
  return request({
    url: "/supplychain/user/login",
    method: "post",
    data
  });
}

export function register(data) {
  return request({
    url: "/supplychain/user/register",
    method: "post",
    data
  });
}
