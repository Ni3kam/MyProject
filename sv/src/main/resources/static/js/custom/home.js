//main.js

(function() {
	var app = angular.module('app', []);

	app.controller('homeController', homeController);

	function homeController($http, $scope, $filter, $window, $location) {

		$scope.cews = [];

		function init(){//  showLoader();
		}
		
		
		$scope.createTrip = function() {
			 notifyError('Failed To Load Branch admins');
			 location.href = "/create-trips"
		}
		
		init();

	}

})();