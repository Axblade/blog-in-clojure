(ns blog-in-clojure.server
  (:use compojure.core)
  (:require [compojure.handler :as handler]
                [compojure.route :as route]
                [blog-in-clojure.models :as models]))

;(server/load-views-ns 'blog-in-clojure.views)

; (defn -main [& m]
;   (let [mode (keyword (or (first m) :dev))
;         port (Integer. (get (System/getenv) "PORT" "8080"))]
;     (server/start port {:mode mode
;                         :ns 'blog-in-clojure})))

(defroutes app-routes []
  (GET "/" [] ()))

(defn app [a]
  (-> (handler/site app-routes)))
