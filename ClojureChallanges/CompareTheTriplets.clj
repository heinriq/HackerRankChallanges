;TODO: Melhorar esse código
(use '[clojure.string :only (split triml)])

(def alice-points (atom 0))
(def bob-points (atom 0))
(
        let [
          a0_temp (read-line) 
          a0_t (split a0_temp #"\s+") 
          a0 (Integer/parseInt (a0_t 0)) 
          a1 (Integer/parseInt (a0_t 1)) 
          a2 (Integer/parseInt (a0_t 2)) 
        ]

      (
        let [
          b0_temp (read-line) 
          b0_t (split b0_temp #"\s+") 
          b0 (Integer/parseInt (b0_t 0)) 
          b1 (Integer/parseInt (b0_t 1)) 
          b2 (Integer/parseInt (b0_t 2)) 
        ]
        (cond
            (> a0 b0)(swap! alice-points inc)
            (< a0 b0)(swap! bob-points inc)
        )
        (cond
            (> a1 b1)(swap! alice-points inc)
            (< a1 b1)(swap! bob-points inc)
        )
        (cond    
            (< a2 b2)(swap! bob-points inc)
            (> a2 b2)(swap! alice-points inc)
        )
        (println @alice-points @bob-points)
      )
)
      
        



