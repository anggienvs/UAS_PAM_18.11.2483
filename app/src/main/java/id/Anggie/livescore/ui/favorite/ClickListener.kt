package id.Anggie.livescore.ui.favorite

import id.Anggie.livescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}