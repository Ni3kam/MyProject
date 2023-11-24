(function () {
    var app = angular.module('app', []);
    app.controller('loginController', loginController);

    function loginController($http, $scope) {

        $scope.login = function () {
            if ($scope.username && $scope.password) {
               // showLoader();
                var data = {
                    "userName": $scope.username,
                    "password": $scope.password
                };
                $http.post("/login", data).then(function (response) {
                    if (response.data.sucess) {
                        notifySuccess('Login Successful');
                        window.location = "home";
                    } else if (response.data.created) {
                        location.href = "reset-password.html#" + response.data.created;
                    } else {
                   //     hideLoader();
                        notifyWarning(response.data.error);
                    }
                }, function (error) {
              	 //    hideLoader();
                    notifyError('Failed To Login');
                    console.log(error);
                });
            } else {
                notifyWarning("Please fill all fields");
            }

        };

    }
    
    function isValidate(value){
        return (value === undefined || value === "" || value === null || value === 'null');
    }
    
})();