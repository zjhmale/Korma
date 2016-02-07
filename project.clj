(defproject zjhmale/korma "0.3.2"
  :description "Tasty SQL for Clojure"
  :url "http://github.com/zjhmale/Korma"
  :codox {:exclude [korma.sql.engine
                    korma.sql.fns
                    korma.sql.utils]
          :src-dir-uri "https://github.com/zjhmale/Korma/tree/add-predicate-keyword"
          :src-linenum-anchor-prefix "L"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [c3p0/c3p0 "0.9.1.2"]
                 [org.clojure/java.jdbc "0.3.3"]]

  :min-lein-version "2.0.0"

  :profiles {:dev {:dependencies [[gui-diff "0.4.0"]
                                  [postgresql "9.0-801.jdbc4"]
                                  [slamhound "1.3.1"]
                                  [criterium "0.3.1"]]
                   :plugins [[codox "0.6.4"]
                             [jonase/eastwood "0.0.2"]
                             [lein-localrepo "0.4.1"]]}
             :test {:dependencies [[mysql/mysql-connector-java "5.1.22"]
                                   [com.h2database/h2 "1.3.164"]
                                   [criterium "0.3.1"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}}
  :aliases {"run-tests" ["with-profile" "1.3:1.4:1.5:1.6" "test"]
            "slamhound" ["run" "-m" "slam.hound"]}
  :jvm-opts ["-Dline.separator=\n"])
