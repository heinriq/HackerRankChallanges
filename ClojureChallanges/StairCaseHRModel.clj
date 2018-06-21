(use '[clojure.string :only (split triml)])

(
    let [
      n_t (read-line) 
      n (Integer/parseInt n_t) 
    ]
    
    (doseq [x (range 1 (+ n 1))] (println (apply str (concat (repeat (- n x) " ") (repeat x "#")))))
)
