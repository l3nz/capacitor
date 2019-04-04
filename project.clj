(defproject lenz/capacitor "0.6.0.2"
  :description "A Clojure client for InfluxDB"
  :url "https://github.com/l3nz/capacitor"
  :license {
    :name "Eclipse Public License"
    :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.9.0" :scope "provided"]
    [clj-http            "2.1.0"]
    [cheshire            "5.8.0"]
    [org.clojure/algo.generic "0.1.2"]]
  :plugins [
    [codox           "0.6.6"]]
  :dev-dependencies [
    [codox "0.6.6"]]
  :codox {
    :output-dir "docs/codox"
    :src-dir-uri "https://github.com/olauzon/capacitor/blob/master/"
    :src-linenum-anchor-prefix "L"}
  :deploy-repositories [
    ["clojars"    {:sign-releases false 
                    :url "https://clojars.org/repo"}]
    ["snapshots" {:sign-releases false 
                    :url "https://clojars.org/repo"}]]
)
