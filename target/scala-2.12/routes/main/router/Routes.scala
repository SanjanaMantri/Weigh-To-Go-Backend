// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sanjana/Documents/Weigh-To-Go-Backend/conf/routes
// @DATE:Fri Mar 29 11:19:41 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:19
  FoodIntakeController_4: controllers.FoodIntakeController,
  // @LINE:24
  ProfileController_6: controllers.ProfileController,
  // @LINE:29
  FoodController_2: controllers.FoodController,
  // @LINE:37
  UserController_5: controllers.UserController,
  // @LINE:45
  HomeController_1: controllers.HomeController,
  // @LINE:47
  CountController_0: controllers.CountController,
  // @LINE:49
  AsyncController_3: controllers.AsyncController,
  // @LINE:52
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:19
    FoodIntakeController_4: controllers.FoodIntakeController,
    // @LINE:24
    ProfileController_6: controllers.ProfileController,
    // @LINE:29
    FoodController_2: controllers.FoodController,
    // @LINE:37
    UserController_5: controllers.UserController,
    // @LINE:45
    HomeController_1: controllers.HomeController,
    // @LINE:47
    CountController_0: controllers.CountController,
    // @LINE:49
    AsyncController_3: controllers.AsyncController,
    // @LINE:52
    Assets_7: controllers.Assets
  ) = this(errorHandler, FoodIntakeController_4, ProfileController_6, FoodController_2, UserController_5, HomeController_1, CountController_0, AsyncController_3, Assets_7, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, FoodIntakeController_4, ProfileController_6, FoodController_2, UserController_5, HomeController_1, CountController_0, AsyncController_3, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foodIntake""", """controllers.FoodIntakeController.createFoodIntake()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foodIntake/""" + "$" + """Id<[^/]+>""", """controllers.FoodIntakeController.deleteFoodIntakeById(Id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foodIntake/today""", """controllers.FoodIntakeController.getAllFoodIntake(startdate:String, endDate:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foodIntake/stats""", """controllers.FoodIntakeController.getStats(startDate:String, endDate:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.createProfile()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/me""", """controllers.ProfileController.updateProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/me""", """controllers.ProfileController.getCurrentProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods""", """controllers.FoodController.getAllFood()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods/""" + "$" + """Id<[^/]+>""", """controllers.FoodController.getFoodById(Id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods""", """controllers.FoodController.createFoods()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """food""", """controllers.FoodController.createFood()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods/""" + "$" + """name<[^/]+>""", """controllers.FoodController.updateFoodByName(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foods/""" + "$" + """Id<[^/]+>""", """controllers.FoodController.deleteFoodById(Id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getAllUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/me""", """controllers.UserController.getCurrentUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.registerUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signin""", """controllers.UserController.signInUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signout""", """controllers.UserController.signOutUser()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """name<[^/]+>""", """controllers.UserController.deleteUserByName(name:String)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:19
  private[this] lazy val controllers_FoodIntakeController_createFoodIntake0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foodIntake")))
  )
  private[this] lazy val controllers_FoodIntakeController_createFoodIntake0_invoker = createInvoker(
    FoodIntakeController_4.createFoodIntake(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodIntakeController",
      "createFoodIntake",
      Nil,
      "POST",
      this.prefix + """foodIntake""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_FoodIntakeController_deleteFoodIntakeById1_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foodIntake/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FoodIntakeController_deleteFoodIntakeById1_invoker = createInvoker(
    FoodIntakeController_4.deleteFoodIntakeById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodIntakeController",
      "deleteFoodIntakeById",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """foodIntake/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_FoodIntakeController_getAllFoodIntake2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foodIntake/today")))
  )
  private[this] lazy val controllers_FoodIntakeController_getAllFoodIntake2_invoker = createInvoker(
    FoodIntakeController_4.getAllFoodIntake(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodIntakeController",
      "getAllFoodIntake",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """foodIntake/today""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_FoodIntakeController_getStats3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foodIntake/stats")))
  )
  private[this] lazy val controllers_FoodIntakeController_getStats3_invoker = createInvoker(
    FoodIntakeController_4.getStats(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodIntakeController",
      "getStats",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """foodIntake/stats""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProfileController_createProfile4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_createProfile4_invoker = createInvoker(
    ProfileController_6.createProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "createProfile",
      Nil,
      "POST",
      this.prefix + """profile""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProfileController_updateProfile5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/me")))
  )
  private[this] lazy val controllers_ProfileController_updateProfile5_invoker = createInvoker(
    ProfileController_6.updateProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "updateProfile",
      Nil,
      "PUT",
      this.prefix + """profile/me""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ProfileController_getCurrentProfile6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/me")))
  )
  private[this] lazy val controllers_ProfileController_getCurrentProfile6_invoker = createInvoker(
    ProfileController_6.getCurrentProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "getCurrentProfile",
      Nil,
      "GET",
      this.prefix + """profile/me""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_FoodController_getAllFood7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods")))
  )
  private[this] lazy val controllers_FoodController_getAllFood7_invoker = createInvoker(
    FoodController_2.getAllFood(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "getAllFood",
      Nil,
      "GET",
      this.prefix + """foods""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_FoodController_getFoodById8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FoodController_getFoodById8_invoker = createInvoker(
    FoodController_2.getFoodById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "getFoodById",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """foods/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_FoodController_createFoods9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods")))
  )
  private[this] lazy val controllers_FoodController_createFoods9_invoker = createInvoker(
    FoodController_2.createFoods(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "createFoods",
      Nil,
      "POST",
      this.prefix + """foods""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_FoodController_createFood10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("food")))
  )
  private[this] lazy val controllers_FoodController_createFood10_invoker = createInvoker(
    FoodController_2.createFood(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "createFood",
      Nil,
      "POST",
      this.prefix + """food""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_FoodController_updateFoodByName11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FoodController_updateFoodByName11_invoker = createInvoker(
    FoodController_2.updateFoodByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "updateFoodByName",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """foods/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_FoodController_deleteFoodById12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foods/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FoodController_deleteFoodById12_invoker = createInvoker(
    FoodController_2.deleteFoodById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FoodController",
      "deleteFoodById",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """foods/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_UserController_getAllUsers13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getAllUsers13_invoker = createInvoker(
    UserController_5.getAllUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getAllUsers",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_UserController_getCurrentUser14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/me")))
  )
  private[this] lazy val controllers_UserController_getCurrentUser14_invoker = createInvoker(
    UserController_5.getCurrentUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getCurrentUser",
      Nil,
      "GET",
      this.prefix + """users/me""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_UserController_registerUser15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_registerUser15_invoker = createInvoker(
    UserController_5.registerUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerUser",
      Nil,
      "POST",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_UserController_signInUser16_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signin")))
  )
  private[this] lazy val controllers_UserController_signInUser16_invoker = createInvoker(
    UserController_5.signInUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signInUser",
      Nil,
      "PUT",
      this.prefix + """users/signin""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_UserController_signOutUser17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signout")))
  )
  private[this] lazy val controllers_UserController_signOutUser17_invoker = createInvoker(
    UserController_5.signOutUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signOutUser",
      Nil,
      "PUT",
      this.prefix + """users/signout""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_UserController_deleteUserByName18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUserByName18_invoker = createInvoker(
    UserController_5.deleteUserByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUserByName",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """users/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_HomeController_index19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index19_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_CountController_count20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count20_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_AsyncController_message21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message21_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Assets_versioned22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned22_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:19
    case controllers_FoodIntakeController_createFoodIntake0_route(params@_) =>
      call { 
        controllers_FoodIntakeController_createFoodIntake0_invoker.call(FoodIntakeController_4.createFoodIntake())
      }
  
    // @LINE:20
    case controllers_FoodIntakeController_deleteFoodIntakeById1_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_FoodIntakeController_deleteFoodIntakeById1_invoker.call(FoodIntakeController_4.deleteFoodIntakeById(Id))
      }
  
    // @LINE:21
    case controllers_FoodIntakeController_getAllFoodIntake2_route(params@_) =>
      call(params.fromQuery[String]("startdate", None), params.fromQuery[String]("endDate", None)) { (startdate, endDate) =>
        controllers_FoodIntakeController_getAllFoodIntake2_invoker.call(FoodIntakeController_4.getAllFoodIntake(startdate, endDate))
      }
  
    // @LINE:22
    case controllers_FoodIntakeController_getStats3_route(params@_) =>
      call(params.fromQuery[String]("startDate", None), params.fromQuery[String]("endDate", None)) { (startDate, endDate) =>
        controllers_FoodIntakeController_getStats3_invoker.call(FoodIntakeController_4.getStats(startDate, endDate))
      }
  
    // @LINE:24
    case controllers_ProfileController_createProfile4_route(params@_) =>
      call { 
        controllers_ProfileController_createProfile4_invoker.call(ProfileController_6.createProfile())
      }
  
    // @LINE:25
    case controllers_ProfileController_updateProfile5_route(params@_) =>
      call { 
        controllers_ProfileController_updateProfile5_invoker.call(ProfileController_6.updateProfile())
      }
  
    // @LINE:26
    case controllers_ProfileController_getCurrentProfile6_route(params@_) =>
      call { 
        controllers_ProfileController_getCurrentProfile6_invoker.call(ProfileController_6.getCurrentProfile())
      }
  
    // @LINE:29
    case controllers_FoodController_getAllFood7_route(params@_) =>
      call { 
        controllers_FoodController_getAllFood7_invoker.call(FoodController_2.getAllFood())
      }
  
    // @LINE:30
    case controllers_FoodController_getFoodById8_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_FoodController_getFoodById8_invoker.call(FoodController_2.getFoodById(Id))
      }
  
    // @LINE:31
    case controllers_FoodController_createFoods9_route(params@_) =>
      call { 
        controllers_FoodController_createFoods9_invoker.call(FoodController_2.createFoods())
      }
  
    // @LINE:32
    case controllers_FoodController_createFood10_route(params@_) =>
      call { 
        controllers_FoodController_createFood10_invoker.call(FoodController_2.createFood())
      }
  
    // @LINE:33
    case controllers_FoodController_updateFoodByName11_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_FoodController_updateFoodByName11_invoker.call(FoodController_2.updateFoodByName(name))
      }
  
    // @LINE:34
    case controllers_FoodController_deleteFoodById12_route(params@_) =>
      call(params.fromPath[Integer]("Id", None)) { (Id) =>
        controllers_FoodController_deleteFoodById12_invoker.call(FoodController_2.deleteFoodById(Id))
      }
  
    // @LINE:37
    case controllers_UserController_getAllUsers13_route(params@_) =>
      call { 
        controllers_UserController_getAllUsers13_invoker.call(UserController_5.getAllUsers())
      }
  
    // @LINE:38
    case controllers_UserController_getCurrentUser14_route(params@_) =>
      call { 
        controllers_UserController_getCurrentUser14_invoker.call(UserController_5.getCurrentUser())
      }
  
    // @LINE:39
    case controllers_UserController_registerUser15_route(params@_) =>
      call { 
        controllers_UserController_registerUser15_invoker.call(UserController_5.registerUser())
      }
  
    // @LINE:40
    case controllers_UserController_signInUser16_route(params@_) =>
      call { 
        controllers_UserController_signInUser16_invoker.call(UserController_5.signInUser())
      }
  
    // @LINE:41
    case controllers_UserController_signOutUser17_route(params@_) =>
      call { 
        controllers_UserController_signOutUser17_invoker.call(UserController_5.signOutUser())
      }
  
    // @LINE:42
    case controllers_UserController_deleteUserByName18_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_UserController_deleteUserByName18_invoker.call(UserController_5.deleteUserByName(name))
      }
  
    // @LINE:45
    case controllers_HomeController_index19_route(params@_) =>
      call { 
        controllers_HomeController_index19_invoker.call(HomeController_1.index)
      }
  
    // @LINE:47
    case controllers_CountController_count20_route(params@_) =>
      call { 
        controllers_CountController_count20_invoker.call(CountController_0.count)
      }
  
    // @LINE:49
    case controllers_AsyncController_message21_route(params@_) =>
      call { 
        controllers_AsyncController_message21_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:52
    case controllers_Assets_versioned22_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned22_invoker.call(Assets_7.versioned(path, file))
      }
  }
}
