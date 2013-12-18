(defproject capacitor "0.1.4-SNAPSHOT"
  :description "A Clojure client for InfluxDB"
  :url         "https://github.com/olauzon/capacitor"
  :license {
    :name "Eclipse Public License"
    :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure    "1.5.1"]
    [org.clojure/core.async "0.1.256.0-1bf8cf-alpha"]
    [clj-http               "0.7.7"]
    [http-kit               "2.1.10"]
    [cheshire               "5.2.0"]]
  :plugins [
    [codox           "0.6.6"]
    [lein-marginalia "0.7.1"]]
  :dev-dependencies [[codox "0.6.6"]]
  :codox {
    :output-dir "docs/codox"
    ;;:src-dir-uri "https://github.com/olauzon/capacitor/blob/v0.1.3/"
    :src-dir-uri "https://github.com/olauzon/capacitor/blob/master/"
    :src-linenum-anchor-prefix "L"
  }
  :aot :all)