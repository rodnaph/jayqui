
(ns jayqui.core
  (:use [jayq.util :only [clj->js]]))

(defn draggable [elem props]
  (.draggable elem (clj->js props)))

(defn droppable [elem props]
  (.draggable elem (clj->js props)))

(defn sortable [elem props]
  (.sortable elem (clj->js props)))

(defn resizable [elem props]
  (.resizable elem (clj->js props)))

