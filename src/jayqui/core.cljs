
(ns jayqui.core
  (:use [jayq.util :only [clj->js]]))

(defn draggable [elem props]
  (.draggable elem (clj->js props)))

