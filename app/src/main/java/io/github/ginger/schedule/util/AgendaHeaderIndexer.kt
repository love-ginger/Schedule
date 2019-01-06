package io.github.ginger.schedule.util

import io.github.ginger.schedule.domain.model.Block
import org.threeten.bp.ZonedDateTime


fun agendaHeaderIndexer(agenda: List<Block>): List<Pair<Int, ZonedDateTime>> =
  agenda.mapIndexed { index, block -> index to block.startTime }
    .distinctBy { it.second.dayOfMonth }

