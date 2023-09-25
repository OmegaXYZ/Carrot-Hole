<template>
    <div class="top-box">
        <div class="white-top-box-title">Carrot Hole</div>
        <div class="top-box-title">Carrot Hole</div>
    </div>
    <div class="white">

    </div>
    <div class="full-page-box">
        <div class="contain-box">
            <div class="article-box">
                <div class="article-title">文章标题1</div>
                <div class="article-content">文章内容1</div>
                <div class="article-title">文章标题2</div>
                <div class="article-content">文章内容2</div>
                <div class="article-title">文章标题3</div>
                <div class="article-content">文章内容3</div>
                <div class="article-title">文章标题4</div>
                <div class="article-content">文章内容4</div>
                <div class="article-title">文章标题5</div>
                <div class="article-content">文章内容5</div>
                <div class="article-title">文章标题6</div>
                <div class="article-content">文章内容6</div>
                <div class="article-title">文章标题7</div>
                <div class="article-content">文章内容7</div>
                <div class="article-title">文章标题8</div>
                <div class="article-content">文章内容8</div>
                <div class="article-title">文章标题9</div>
                <div class="article-content">文章内容9</div>
            </div>
        </div>
        <div class="aside-box">

        </div>
    </div>
</template>

<script>
export default {
    name: 'Homepage',
}
</script>

<style>
.full-page-box {
    width: 100%;
    height: 100vh;
    /* 100%视窗高度 */
    background-color:#f0f0f0 ;
    /* 设置盒子背景颜色 */
}
.white {
    width: 100%;
    height: 5px;
    /* 100%视窗高度 */
    background-color: #F6F6F6;
    /* 设置盒子背景颜色 */
}
.contain-box{
    width: 50%;
    margin:0 auto;
    max-width:800px;
    height: 100%;
    /* 100%视窗高度 */

    background-color: #F6F6F6;
    padding: 20px; /* 内边距 */
    border-top: 2px solid #ccc; /* 添加上边框线 */
    /* 设置盒子背景颜色 */
    /* 放置方式：左对齐，位置合适 */
    display: flex;
    justify-content: flex-start;
    align-items: flex-start;
    margin-top: 0;
}
.article-box{
    width: 100%;
    height: auto;
    /* 100%视窗高度 */
    background-color: #F6F6F6;
    /* 设置盒子背景颜色 */
    /* 放置方式：左对齐，位置合适 */
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
}
.article-title{
    width: 100%;
    height: 100px;
    text-align: left; /* 文字左对齐 */
    /* 100%视窗高度 */
    background-color: #F6F6F6;
    /* 设置盒子背景颜色 */
    /* 放置方式：左对齐，位置合适 */
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 30px;
    font-weight: bold;
}
.article-content{
    width: 100%;
    height: 100%;
    text-align: left; /* 文字左对齐 */
    /* 100%视窗高度 */
    background-color: #F6F6F6;
    /* 设置盒子背景颜色 */
    /* 放置方式：左对齐，位置合适 */
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: row;
    font-size: 20px;
}
.aside-box{
    width: 30%;
    height: 100%;
    /* 100%视窗高度 */
    background-color: #F6F6F6;
    /* 设置盒子背景颜色 */
    /* 放置方式：左对齐，位置合适 */
    display: flex;
    justify-content: center;
    align-items: center;
}
.top-box {
    width: 100%;
    height: 60px;
    margin-bottom: 20px auto 0;
    /* 100%视窗高度 */
    background-color: #F6F6F6;
    /* 设置盒子背景颜色 */
    /* 放置方式：左对齐，位置合适 */
    display: flex;
    /* justify-content: center; */
    /* align-items: center; */
    border-bottom: 2px solid #ccc; /* 添加底部边框线 */
}
.top-box-title {
    /* left title blue front */
    color: #1E90FF;
    font-size: 30px;
    font-weight: bold;
}
.white-top-box-title {
    /* right title white front */
    color: #F6F6F6;
    font-size: 30px;
    font-weight: bold;
}
</style>
