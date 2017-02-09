import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Containers */
import home from './containers/home.vue'
import place from './containers/place.vue'

// application routes
const routes = [
  { path: '/', component: home },
  { path: '/place/:id', component: place }
]

// export router instance
export default new Router({
  mode: 'history',
  routes,
  linkActiveClass: 'is-active'
})