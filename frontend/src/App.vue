<template>
    <div id="app">
      <router-view :key="$route.path"> </router-view>
    </div>
  </template>
  
  <script>
  export default {
    name: 'app',
  }
  </script>