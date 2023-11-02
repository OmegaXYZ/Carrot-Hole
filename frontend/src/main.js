import { createApp } from "vue";
// import {Vue from 'vue'
import App from "./App.vue";
// import {Router} from 'vue-router'

// createApp(App).mount('#app')

import board from "@/components/board.vue";
import boardHome from "@/pages/Home.vue";

import store from "./store/index.js";
import "@/assets/css/tailwind.css";

//导入markdown
// import VueMarkdownEditor from '@kangc/v-md-editor';
// import '@kangc/v-md-editor/lib/style/base-editor.css';
// import vuepressTheme from '@kangc/v-md-editor/lib/theme/vuepress.js';
// import '@kangc/v-md-editor/lib/theme/style/vuepress.css';
// import VueMarkdownEditor from '@kangc/v-md-editor';
// import '@kangc/v-md-editor/lib/style/base-editor.css';
// import vuepressTheme from '@kangc/v-md-editor/lib/theme/vuepress.js';
// import '@kangc/v-md-editor/lib/theme/style/vuepress.css';


// Vue.config.productionTip = false
// Vue.use(Router)
import { createRouter, createWebHistory } from "vue-router";

// 创建路由实例
const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: "/board",
      component: board,
      children: [
        { path: "/", redirect: { name: "Home" } },
        { path: "home", name: "Home", component: boardHome },
        { path: "post", name: "Post", component: () => import("@/pages/Post.vue") },
        { path: ""}
      ],
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
