<template>
  <div class="w-full border-t-2 px-8 py-6 lg:flex justify-between items-center">
      <p class="mb-2 lg:mb-0">© Copyright 2023</p>

      <div class="flex">
          <!-- <a href="#" class="mr-6 hover:text-gray-900">Terms of Service</a> -->
          <!-- <a href="#" class="mr-6 hover:text-gray-900">Privacy Policy</a> -->
          <a href="#" class="hover:text-gray-900">软件工程课程作业</a>
      </div>
  </div>
</template>

<script>


export default {
    name : "Footer",
    data() {
        return {
            post: "hello",
            text: 'helloFooter',
            markdown: "### 标题",
        };
    },
};
</script>