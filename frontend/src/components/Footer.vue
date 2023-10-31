<template>
    <v-md-editor :model-value="markdown" mode="preview"></v-md-editor>
</template>

<script>
export default {
    data() {
        return {
            text: '',
            markdown: "### 标题",
        };
    },
};
</script>