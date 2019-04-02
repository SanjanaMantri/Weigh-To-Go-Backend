// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sanjana/Documents/Weigh-To-Go-Backend/conf/routes
// @DATE:Fri Mar 29 11:19:41 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:19
package controllers.javascript {

  // @LINE:52
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseFoodController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getFoodById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.getFoodById",
      """
        function(Id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "foods/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("Id", Id0))})
        }
      """
    )
  
    // @LINE:32
    def createFood: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.createFood",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "food"})
        }
      """
    )
  
    // @LINE:31
    def createFoods: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.createFoods",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "foods"})
        }
      """
    )
  
    // @LINE:33
    def updateFoodByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.updateFoodByName",
      """
        function(name0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "foods/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:34
    def deleteFoodById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.deleteFoodById",
      """
        function(Id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "foods/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("Id", Id0))})
        }
      """
    )
  
    // @LINE:29
    def getAllFood: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodController.getAllFood",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "foods"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def getCurrentProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.getCurrentProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/me"})
        }
      """
    )
  
    // @LINE:24
    def createProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.createProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:25
    def updateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.updateProfile",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/me"})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def getCurrentUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getCurrentUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/me"})
        }
      """
    )
  
    // @LINE:42
    def deleteUserByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUserByName",
      """
        function(name0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:40
    def signInUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signInUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signin"})
        }
      """
    )
  
    // @LINE:39
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.registerUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:41
    def signOutUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signOutUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signout"})
        }
      """
    )
  
    // @LINE:37
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
  }

  // @LINE:45
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:49
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseFoodIntakeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodIntakeController.getStats",
      """
        function(startDate0,endDate1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "foodIntake/stats" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("startDate", startDate0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate1)])})
        }
      """
    )
  
    // @LINE:21
    def getAllFoodIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodIntakeController.getAllFoodIntake",
      """
        function(startdate0,endDate1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "foodIntake/today" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("startdate", startdate0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate1)])})
        }
      """
    )
  
    // @LINE:19
    def createFoodIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodIntakeController.createFoodIntake",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "foodIntake"})
        }
      """
    )
  
    // @LINE:20
    def deleteFoodIntakeById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FoodIntakeController.deleteFoodIntakeById",
      """
        function(Id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "foodIntake/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("Id", Id0))})
        }
      """
    )
  
  }


}
