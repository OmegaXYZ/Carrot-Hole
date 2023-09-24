<template>
    <div class=" md:mx-auto relative bg-white overflow-hidden border-b">
        <div class="h-12 md:ml-10 md:pr-4 md:space-x-8 flex justify-center">
            <a href="#" class="font-medium text-gray-500 hover:text-gray-900 flex items-center">Home</a>
            <a href="#" class="font-medium text-gray-500 hover:text-gray-900 flex items-center">Product</a>
            <a href="#" class="font-medium text-gray-500 hover:text-gray-900 flex items-center">Article</a>
            <a href="#" class="font-medium text-gray-500 hover:text-gray-900 flex items-center">About</a>
            <a href="#" class="font-medium text-indigo-600 hover:text-indigo-500 flex items-center">Log in</a>
        </div>
    </div>
    <div class="background">
        <!-- <header>
            <p>hello header</p>
        </header> -->
        <main>
            <div class="contain">
                <p>hello main</p>
                <p>{{ msg }}</p>
            </div>
            <!-- 主要内容 -->
        </main>
        <aside>

        </aside>
        <div class="bg-blue-500 text-white p-4">
        This is a div with Tailwind CSS styles.
        </div>
        <!-- <footer>
            <p>hello footer</p>
        </footer> -->
    </div>
</template>

<script>
export default {
    name: 'AppLayout',
    data(){
        return{
            msg:"hello world"
        }
    }

    // 可以在这里定义布局组件的逻辑
}
</script>

<style scoped>
.layout {
    display: flex;
    flex-direction: raw;
    min-height: 100vh;
    /* 设置最小高度以确保内容充满整个视口 */
}

header{
  background-color: white; /* 背景颜色为白色 */
  width: 100%; /* 占据整个宽度 */
  height: 80px; /* 设置高度为80px，可以根据需要进行调整 */
}
main,
footer {
    padding: 20px;
    /* 可以根据需要设置其他样式 */
}
.contain {
    margin: 0 auto; /* 让容器居中 */
    width: 66.67%; /* 占2/3的宽度 */
}
.background{
    background-color:rgba(63, 56, 56, 0); /* 设置背景颜色 */
    position: absolute; /* 使用绝对定位 */
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    z-index: -1; /* 设置一个负的 z-index 值，以确保背景在内容之后 */
}
</style>
