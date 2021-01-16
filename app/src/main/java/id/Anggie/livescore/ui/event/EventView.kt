package id.Anggie.livescore.ui.event

import id.Anggie.livescore.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}