'use strict';

/**
 * @ngdoc overview
 * @name singlePageCheckoutApp
 * @description
 * # singlePageCheckoutApp
 *
 * Main module of the application.
 */
angular
  .module('singlePageCheckoutApp', [
    'ngAnimate',
    'ngAria',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
	  .when('/', {
        templateUrl: 'views/checkout.html',
        controller: 'CheckoutCtrl',
        controllerAs: 'checkout'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
