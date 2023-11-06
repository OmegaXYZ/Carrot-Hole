import { createRouter, createWebHistory } from "vue-router";

import board from "@/components/board.vue";
import boardHome from "@/pages/Home.vue";

//import store from "./store/index.js";
//import "@/assets/css/tailwind.css";

import HomePage from "@/components/HomePage.vue"
import DashboardHome from '@/pages/Home.vue'
import PostPage from '@/pages/PostPage.vue'
import ReleasePost from '@/pages/ReleasePost.vue'
import LoginPage from "@/components/LoginPage.vue"
import test from '@/pages/test.vue'

const routerPath = [
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
  ];

const router = createRouter({
    history: createWebHistory(),
    routes: routerPath,
  });

export default router;