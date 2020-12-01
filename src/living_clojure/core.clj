(ns living-clojure.core
  (:gen-class))

(defn greet
  ([args]
    (str "G'day " (or (first args) "World"))))
  
(defn -main
  "I greet someone or everyone"
  [& args]
  (println (greet args)))
