// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sanjana/Documents/Weigh-To-Go-Backend/conf/routes
// @DATE:Fri Mar 29 11:19:41 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:19
package controllers {

  // @LINE:52
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:29
  class ReverseFoodController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getFoodById(Id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "foods/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("Id", Id)))
    }
  
    // @LINE:32
    def createFood(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "food")
    }
  
    // @LINE:31
    def createFoods(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "foods")
    }
  
    // @LINE:33
    def updateFoodByName(name:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "foods/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:34
    def deleteFoodById(Id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "foods/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("Id", Id)))
    }
  
    // @LINE:29
    def getAllFood(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "foods")
    }
  
  }

  // @LINE:24
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def getCurrentProfile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile/me")
    }
  
    // @LINE:24
    def createProfile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:25
    def updateProfile(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "profile/me")
    }
  
  }

  // @LINE:47
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:37
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def getCurrentUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/me")
    }
  
    // @LINE:42
    def deleteUserByName(name:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:40
    def signInUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "users/signin")
    }
  
    // @LINE:39
    def registerUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:41
    def signOutUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "users/signout")
    }
  
    // @LINE:37
    def getAllUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
  }

  // @LINE:45
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:49
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:19
  class ReverseFoodIntakeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getStats(startDate:String, endDate:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "foodIntake/stats" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("startDate", startDate)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("endDate", endDate)))))
    }
  
    // @LINE:21
    def getAllFoodIntake(startdate:String, endDate:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "foodIntake/today" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("startdate", startdate)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("endDate", endDate)))))
    }
  
    // @LINE:19
    def createFoodIntake(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "foodIntake")
    }
  
    // @LINE:20
    def deleteFoodIntakeById(Id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "foodIntake/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("Id", Id)))
    }
  
  }


}
