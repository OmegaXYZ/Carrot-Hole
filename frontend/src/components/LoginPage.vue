<template>
<div class="leading-normal tracking-normal" id="main-body">
    <div class="gradient-bg">
  <div class="flex flex-wrap justify-center items-center h-screen">
    <div class="w-full md:w-1/2 lg:w-1/3 px-4">
        <h2 class="text-3xl font-semibold mb-4 flex items-center justify-center">Carrot-Hole</h2>
      <div class="bg-white rounded shadow p-6">
        <h2 class="text-2xl font-semibold mb-4 flex items-center justify-center">登录</h2>
        <div class="mb-4">
          <label class="block text-gray-700 text-sm font-bold mb-2 flex items-center justify-center" for="username">用户名</label>
          <input class="w-full px-3 py-2 border rounded shadow appearance-none text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="username" type="text" placeholder="用户名">
        </div>
        <div class="mb-4">
          <label class="block text-gray-700 text-sm font-bold mb-2 flex items-center justify-center" for="password">密码</label>
          <input class="w-full px-3 py-2 border rounded shadow appearance-none text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="password" type="password" placeholder="密码">
        </div>
        <button class="w-full bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline" type="button">
          <router-link to="/dashboard/home"> 登录 </router-link>
        </button>
      </div>
    </div>
  </div>
  </div>
</div>
</template>
  
<!-- s -->

<style scoped>
.waves-bg {
  background: linear-gradient(45deg, #ff4e50, #fc913a);
  background-size: 200% 200%;
  animation: wave 1s linear infinite;
  opacity: 50%;
}
.gradient-bg {
  background: linear-gradient(45deg, #3498db, #2980b9, #1e67a2);
  background-size: 200% 200%;
  animation: wave 1s linear infinite;
}

@keyframes wave {
  0% {
    background-position: 0% 100%;
  }
  100% {
    background-position: 100% 0%;
  }
}
</style>

<script>

export default {
name: 'LoginPage',
}
</script>