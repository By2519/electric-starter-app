(ns electric-starter-app.main
  (:require [hyperfiddle.electric :as e]
            [hyperfiddle.electric-dom2 :as dom]
            ))

;; Saving this file will automatically recompile and update in your browser

(e/defn Main [ring-request]
  (e/client
    (binding [dom/node js/document.body] 
      (dom/button (dom/props {:style {:font-size "18px"
                                      :margin "12px 0 6px 12px"
                                      :background-color "rgb(82, 82, 255)"
                                      :color "white"
                                      :border "none"
                                      :padding "4px 17px 4px 17px"
                                      :border-radius "5px"
                                      :box-shadow "0 8px 16px 0 rgba(0,0,0,0.4)" 
                                      :position "relative"
                                      }
                             :hover {:cursor "pointer"
                                     :opacity "0.9"}
                             :active {:opacity "0.7"
                                      :box-shadow "none"}
                             }
                  ) 
        (dom/text "Add")
      )
      (dom/div (dom/props {:id "outer"})
        (dom/div (dom/props {:id "main"
                             :style {:display "inline-flex" 
                                     :flex-direction "column" 
                                     :width "400px" 
                                     :height "300px" 
                                     :align-items "center"
                                     :margin "12px"
                                     :border "2px solid black"
                                     :padding "8px"
                                     :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)"
                                     :position "relative"
                                    }
                            }
                 )
            (dom/div (dom/props {:id "header"
                                 :style {:display "flex"
                                             :width "100%"
                                             :justify-content "end"
                                             :box-sizing "border-box"
                                             :padding "4px"
                                             :border "2px solid black"
                                             :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)"
                                        }
                                }
                     ) 
                (dom/button (dom/props {:class "close"
                                        :style {:font-size "18px"
                                                :color "black"
                                                :box-sizing "border-box"
                                                :margin-right "9px"
                                                :background-color "rgb(255, 0, 0)"
                                                :border "2px solid black"
                                                :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)" 
                                               }
                                        :hover {:opacity "0.9"
                                                :cursor "pointer"}
                                        :active {:box-shadow "none"}
                                       }
                            )
                    (dom/text "X")))
            (dom/textarea (dom/props {:id "textarea"
                                      :style {:width "100%"
                                              :height "100%"
                                              :overflow "scroll"
                                              :box-sizing "border-box"
                                              :margin-bottom "6px"
                                              :margin-top "6px"
                                              :padding "13px"
                                              :border "2px solid black"
                                              :font-size "15px"
                                              :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)"
                                             }
                                     }
                          ) 
                (dom/text "Text"))
            (dom/div (dom/props {:id "footer"
                                 :style {:width "100%"
                                         :display "flex"
                                         :position "relative"
                                         :justify-content "space-between"
                                         :box-sizing "border-box"
                                         :padding "3px"
                                         :border "2px solid black"
                                         :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)"
                                        }
                                }
                     ) 
              (dom/button (dom/props {:id "model"
                                      :style {:font-size "15px"
                                                  :margin-left "10px"
                                                  :transition "1"
                                                  :box-sizing "border-box"
                                                  :border "2px solid black"
                                                  :background-color "rgb(253, 190, 0)"
                                                  :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)"
                                             }
                                      :hover {:opacity "0.9"
                                             :cursor "pointer"
                                             :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)"}
                                      :active {:box-shadow "none"} 
                                     }
                          ) 
                (dom/text "Model"))
                (dom/div (dom/props {:id "dropdownContent" :class "dropdown-content"
                                     :style {:position "absolute"
                                                 :background-color "#f9f9f9"
                                                 :font-size "17px"
                                                 :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)"
                                                 :border "1px solid #ddd"
                                                 :padding "0 0 0 0"
                                                 :top "55px"
                                                 :display "none"
                                            }
                                    }
                         )
                    (dom/a (dom/props {:href "#" :target "_blank"
                                       :style {:display "block"
                                               :padding "10px"
                                               :text-decoration "none"
                                               :color "#333"}}) (dom/text "Chat-Gpt")) 
                    (dom/a (dom/props {:href "#" :target "_blank"
                                       :style {:display "block"
                                               :padding "10px"
                                               :text-decoration "none"
                                               :color "#333"}}) (dom/text "Gemini"))
                    (dom/a (dom/props {:href "#" :target "_blank"
                                       :style {:display "block"
                                               :padding "10px"
                                               :text-decoration "none"
                                               :color "#333"}}) (dom/text "Bharat")))
              (dom/button (dom/props {:id "send"
                                      :style {:font-size "15px"
                                                  :padding "12px"
                                                  :margin-right "10px"
                                                  :box-sizing "border-box"
                                                  :transition "1"
                                                  :background-color "rgb(0, 255, 0)"
                                                  :border "2px solid black"
                                                  :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)"
                                             }
                                     :hover {:opacity "0.9"
                                                 :cursor "pointer"
                                                 :box-shadow "0 8px 16px 0 rgba(0,0,0,0.2)"
                                            }
                                     :active {:box-shadow "none"}}
                          )
                (dom/text "Send"))
            )
        )
      )
    )
  )
)
