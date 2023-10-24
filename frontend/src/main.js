import { createApp } from "vue";
// import {Vue from 'vue'
import App from "./App.vue";
// import {Router} from 'vue-router'

// createApp(App).mount('#app')

import Dashboard from "@/components/Dashboard.vue";
import DashboardHome from "@/pages/Home.vue";

import store from "./store/index.js";
import "@/assets/css/tailwind.css";

//导入markdown
import VueMarkdownEditor from '@kangc/v-md-editor';
import '@kangc/v-md-editor/lib/style/base-editor.css';
import vuepressTheme from '@kangc/v-md-editor/lib/theme/vuepress.js';
import '@kangc/v-md-editor/lib/theme/style/vuepress.css';


// Vue.config.productionTip = false
// Vue.use(Router)
import { createRouter, createWebHistory } from "vue-router";

// 创建路由实例
const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: "/", redirect: { name: "DashboardHome" } },
    {
      path: "/dashboard",
      component: Dashboard,
      children: [
        { path: "/", redirect: { name: "DashboardHome" } },
        { path: "home", name: "DashboardHome", component: DashboardHome },
      ],
    },
  ],
});


// 导出路由实例
export default router;

const app = createApp(App);

app.use(router); // 使用路由
app.use(store); // 使用 Vuex

app.mount("#app"); // 挂载 Vue 3 应用到 HTML 元素
