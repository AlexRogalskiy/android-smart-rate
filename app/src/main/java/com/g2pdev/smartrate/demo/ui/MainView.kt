package com.g2pdev.smartrate.demo.ui

import com.g2pdev.smartrate.logic.model.SmartRateConfig
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView {

    fun showSessionCount(sessionCount: Int)
    fun showSessionCountBetweenPrompts(sessionCountBetweenPrompts: Int)

    fun setFakeSessionCount(sessionCount: Int)

    fun showCountersCleared()

    fun showRated(stars: Float)
    fun showNeverClicked()
    fun showLaterClicked()

    fun showFeedbackCancelClicked()
    fun showFeedbackSubmitClicked(text: String)

    fun setConfig(config: SmartRateConfig)

}