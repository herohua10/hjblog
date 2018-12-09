<template>
   <div class="container-fluid" style="background-color: #F4F7F8">
      <home-header :bgm="bgm"></home-header>
      <div class="row">
        <div class="col-lg-7 col-lg-offset-1" style="margin-top: 10px; padding: 0 0;">
          <home-swiper :swiperList="swiperList"></home-swiper>
        </div>
      </div>
      <div class="row">
        <div class="col-lg-7 col-lg-offset-1" style="margin-top: 10px;padding: 0 0;">
          <home-list :articleList="articleList"></home-list>
        </div>
      </div>
   </div>
</template>

<script>
import HomeHeader from './components/HomeHeader'
import HomeSwiper from './components/HomeSwiper'
import HomeList from './components/HomeList'
import axios from 'axios'

export default {
  name: 'Home',
  components: {
    HomeHeader,
    HomeSwiper,
    HomeList
  },
  data () {
    return {
      bgm: '',
      swiperList: [],
      articleList: []
    }
  },
  methods: {
    getHomeData () {
      axios.get('/api/home.json')
        .then(this.getHomeDataSucc)
    },
    getHomeDataSucc (resp) {
      resp = resp.data
      if (resp.ret && resp.data) {
        const data = resp.data
        this.bgm = data.bgm
        this.swiperList = data.swiperList
        this.articleList = data.articleList
      }
    }
  },
  mounted () {
    this.getHomeData()
  }
}
</script>

<style scoped>
</style>
