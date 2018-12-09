<template>
  <div class="wrapper">
    <swiper :options="swiperOption" v-if="showSwiper"
            @mouseover.native="showNavigation" @mouseout.native="hideNavigation">
      <!-- slides -->
      <swiper-slide v-for="imgItem of swiperList" :key="imgItem.id">
        <img class="swiper-img" :src="imgItem.imgUrl">
      </swiper-slide>
      <!-- Optional controls -->
      <div class="swiper-pagination"  slot="pagination"></div>
      <div class="swiper-button-prev swiper-button-white" slot="button-prev" v-show="isShowNavigation"></div>
      <div class="swiper-button-next swiper-button-white" slot="button-next" v-show="isShowNavigation"></div>
    </swiper>
  </div>
</template>

<script>
export default {
  name: 'HomeSwiper',
  props: {
    swiperList: Array
  },
  data () {
    return {
      // 轮播图参数
      swiperOption: {
        speed: 300,
        autoplay: {
          delay: 3000
        },
        pagination: {
          el: '.swiper-pagination',
          clickable: true
        },
        navigation: {
          nextEl: '.swiper-button-next',
          prevEl: '.swiper-button-prev'
        },
        loop: true,
        effect: 'fade'
      },
      isShowNavigation: false
    }
  },
  computed: {
    showSwiper () {
      return this.swiperList.length
    }
  },
  methods: {
    // 鼠标移入显示导航箭头方法
    showNavigation: function () {
      this.isShowNavigation = true
    },
    // 鼠标移出隐藏导航箭头方法
    hideNavigation: function () {
      this.isShowNavigation = false
    }
  }
}
</script>

<style scoped>
  .wrapper >>> .swiper-pagination-bullet-active {
    background-color: #fff;
  }
  .wrapper >>> .swiper-button-prev,
  .swiper-button-next {
    background-color: rgba(0,0,0,.075);
    width: 6%;
    height: 12%;
  }
  .wrapper {
    overflow: hidden;
    width: 100%;
    height: 0;
    padding-bottom: 50%;
  }
  .swiper-img {
    width: 100%;
  }

</style>
