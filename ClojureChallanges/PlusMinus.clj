(use '[clojure.string :only (split triml)])

(def positives (atom 0))
(def negatives (atom 0))
(def zeroes (atom 0))

(
    let [
      n_t (read-line) 
      n (Integer/parseInt n_t) 
    ]

  (
    let [
      arr_temp (read-line) 
      arr_t (split arr_temp #"\s+") 
      arr (map #(Integer/parseInt %) arr_t) 
    ]
    
    (doseq[x arr]
        (cond
        (< x 0) (swap! negatives inc)
        (> x 0) (swap! positives inc)
        (= x 0) (swap! zeroes inc))
    )
    (println (float (/ @positives n)))
    (println (float (/ @negatives n)))
    (println (float (/ @zeroes n)))
  )

)
