(use '[clojure.string :only (split triml)])

(
    let [
      n_t (read-line) 
      n (Integer/parseInt n_t) 
    ]

  (
    let [
      a (for [a_temp (range n)]  (vec (map #(Integer/parseInt %) (split (read-line) #"\s+") ) ) )
      matrix (vec a)
      primary-coords (for [i (range n)] [i i])
      secondary-coords (for [i (range n)] [(- n i 1) i])
      primaries (vec (map #(get-in matrix %) primary-coords))
      secondaries (vec (map #(get-in matrix %) secondary-coords))      
    ]
    (println (Math/abs (- (reduce + primaries) (reduce + secondaries))))
  )
)
