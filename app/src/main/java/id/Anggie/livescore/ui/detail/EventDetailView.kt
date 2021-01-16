package id.Anggie.livescore.ui.detail


import id.Anggie.livescore.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}