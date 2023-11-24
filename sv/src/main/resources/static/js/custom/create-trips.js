//main.js

(function() {
	var app = angular.module('app', []);

	app.controller('createTripController', createTripController);

	function createTripController($http, $scope, $filter, $window, $location) {

		$scope.cews = [];

		function init() {
                        showLoader();
		}
		
		init();

	}

})();