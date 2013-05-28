(require '[clojure.tools.nrepl.server :refer [start-server]])
(require '[clojure.pprint :refer [pprint]])
(defonce server (start-server))
(println "Started nREPL server with following specifications:")
(pprint (into {} server))