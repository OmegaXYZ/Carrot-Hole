import { createApp } from "vue";

import App from "./App.vue";

import store from "./store/index.js";
import "@/assets/css/tailwind.css";

import router from "./router";


const app = createApp(App);

app.use(router); // 使用路由
app.use(store); // 使用 Vuex
app.mount("#app"); // 挂载 Vue 3 应用到 HTML 元素
