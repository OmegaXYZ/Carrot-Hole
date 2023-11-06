import { createApp } from "vue";
// import {Vue from 'vue'
import App from "./App.vue";
// import {Router} from 'vue-router'

// createApp(App).mount('#app')

import board from "@/components/board.vue";
import boardHome from "@/pages/Home.vue";

import store from "./store/index.js";
import "@/assets/css/tailwind.css";

import HomePage from "@/components/HomePage.vue"
import DashboardHome from '@/pages/Home.vue'
import PostPage from '@/pages/PostPage.vue'
import ReleasePost from '@/pages/ReleasePost.vue'
import LoginPage from "@/components/LoginPage.vue"
import test from '@/pages/test.vue'

// Vue.config.productionTip = false
// Vue.use(Router)
import { createRouter, createWebHistory } from "vue-router";


// 创建路由实例
const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', redirect: { name: 'DashboardHome' } },
    { path: '/dashboard', component: HomePage, children: [
        { path: '/', redirect: { name: 'DashboardHome' } },
        { path: 'home', name: 'DashboardHome', component: DashboardHome }
      ]
    },
    { path: '/Post', component: HomePage, children: [
        { path: '/', redirect: { name: 'PostPage' } },
        { path: 'home', name: 'PostPage', component: PostPage},
        { path: 'test', name: 'test', component: test}
      ]
    },
    { path: '/ReleasePost', component: HomePage, children: [
      { path: '/', redirect: { name: 'ReleasePost' } },
      { path: 'home', name: 'ReleasePost', component: ReleasePost }
      ]
    },
    { path: '/LoginPage', component: LoginPage, children: [
      { path: '/', name: 'LoginPage'}
      ]
    },
  ],
});


// 导出路由实例
export default router;

const app = createApp(App);

app.use(router); // 使用路由
app.use(store); // 使用 Vuex
//app.use(VueMarkdownEditor);
app.mount("#app"); // 挂载 Vue 3 应用到 HTML 元素
