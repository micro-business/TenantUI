(ns micro-business.tenantui
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]))

(enable-console-print!)

(defui TenantUI
  Object
  (render [this]
          (dom/div nil "Tenant UI")))

(def tenantUI (om/factory TenantUI))

(defn ^:export renderTenantUI [elementName]
  (js/ReactDOM.render (tenantUI) (gdom/getElement elementName)))

(renderTenantUI  "tenantUIArea")
