(ns micro-business.tenantui
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]))

(enable-console-print!)

(defui HelloWorld
  Object
  (render [this]
          (dom/div nil "Tenant UI")))

(def hello (om/factory HelloWorld))

(defn ^:export renderTenantUI [elementName]
  (js/ReactDOM.render (hello) (gdom/getElement elementName)))
