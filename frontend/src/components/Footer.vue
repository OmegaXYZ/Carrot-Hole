<template>
    <div class = "p-6 bg-gray-100 mb-10" id="Footer">
        {{text}}
        {{ post }}
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