---
key: ICSE-22c
permalink: /papers/ICSE-22c/
short_name: ICSE '22
title: "DeepDiagnosis: Automatically Diagnosing Faults and Recommending Actionable Fixes in Deep Learning Programs"
bib: |
  @inproceedings{wardat2021deepdiagnosis,
    author={Mohammad Wardat and Breno Dantas Cruz and Wei Le and Hridesh Rajan},
    title={DeepDiagnosis: Automatically Diagnosing Faults and Recommending Actionable Fixes in Deep Learning Programs}, 
    booktitle = {ICSE'22: The 44th International Conference on Software Engineering},
    location = {Pittsburgh, PA, USA},
    month = {May 21-May 29, 2022},
    year = {2022},
    entrysubtype = {conference},
    abstract = {
      Deep Neural Networks (DNNs) are used in a wide variety of applications. However, as in any software application, DNN-based apps are afflicted with bugs. Previous work observed that DNN bug fix patterns are different from traditional bug fix patterns. Furthermore, those buggy models are non-trivial to diagnose and fix due to inexplicit errors with several options to fix them. To support developers in locating and fixing bugs, we propose DeepDiagnosis, a novel debugging approach that localizes the faults, reports error symptoms and suggests fixes for DNN programs. In the first phase, our technique monitors a training model, periodically checking for eight types of error conditions. Then, in case of problems, it reports messages containing sufficient information to perform actionable repairs to the model. In the evaluation, we thoroughly examine 444 models -53 real-world from GitHub and Stack Overflow, and 391 curated by AUTOTRAINER. DeepDiagnosis provides superior accuracy when compared to UMLUAT and DeepLocalize. Our technique is faster than AUTOTRAINER for fault localization. The results show that our approach can support additional types of models, while state-of-the-art was only able to handle classification ones. Our technique was able to report bugs that do not manifest as numerical errors during training. Also, it can provide actionable insights for fix whereas DeepLocalize can only report faults that lead to numerical errors during training. DeepDiagnosis manifests the best capabilities of fault detection, bug localization, and symptoms identification when compared to other approaches.
    }
  }
kind: conference
download_link: deepdiagnosis.pdf
publication_year: 2022
tags:
  - d4
---