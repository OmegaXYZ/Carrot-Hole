// /tailwind.config.js

module.exports = {
  // Tailwind CSS 3.0版本开始, 不再使用purgeCSS进行打包优化. 使用`content`配置项代替原`purge`配置项.
  content: [
    './public/**/*.html',
    './src/**/*.{js,jsx,ts,tsx,vue}',
  ],
  theme: {
    extend: {},
  },
  plugins: []
  // 配置前缀, 防止类名与其他UI框架冲突
  // prefix: 'tw-'
}
