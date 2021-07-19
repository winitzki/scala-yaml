package org.virtuslab.internal.load.reader

sealed trait ReaderState
case object ReaderState:
  case object Stream               extends ReaderState
  case object Document             extends ReaderState
  case class Mapping(indent: Int)  extends ReaderState
  case class Sequence(indent: Int) extends ReaderState