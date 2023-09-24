

// 在最外层创建 /postcss.config.js

module.exports = {
  plugins: {
    tailwindcss: { config: './tailwind.config.js' },
    autoprefixer: { config: require('autoprefixer') }
  }
}

