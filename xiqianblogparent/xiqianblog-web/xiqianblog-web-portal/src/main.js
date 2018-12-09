import Vue from 'vue'
import App from './App'
import router from './router'
import VueAwesomeSwiper from 'vue-awesome-swiper'
import $ from 'jquery'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'
import 'swiper/dist/css/swiper.css'
import 'font-awesome/css/font-awesome.min.css'

Vue.config.productionTip = false
Vue.use(VueAwesomeSwiper, /* { default global options } */)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
