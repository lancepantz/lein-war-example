(ns servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use compojure.core ring.util.servlet))

(defroutes wartest
  (GET "/" [] "<h1>Hello World</h1>")
  (ANY "*" []
    {:status 404, :body "<h1>Page not found</h1>"}))

(defservice wartest)
