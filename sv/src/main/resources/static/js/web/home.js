//main.js

(function() {
	var app = angular.module('app', []);

	app.controller('homeController', homeController);

	function homeController($http, $scope, $filter, $window, $location) {

		$scope.cews = "Nitin NIkam";

		$scope.enquery = {
			name: '',
			email: '',
			comment: '',
			mobile: ''
		}

		function init() {

		}

		$scope.viewTrip = function() {
			 notifyError('Failed To Load Branch admins');
			 location.href = "/view-trip"
		}
		
		$scope.book = function() {
			 notifyError('Failed To Load Branch admins');
			 location.href = "/book"
		}
		

		$scope.saveEnquery = function() {
			if ($scope.enquery.name == '') {
				notifyError('Failed To Load Plans');
			}
			showLoader();
			$http.post("/sv/api/enquery", $scope.enquery).then(function(response) {

			}, function(error) {

			});
			hideLoader();
		}


		init();

	}

})();