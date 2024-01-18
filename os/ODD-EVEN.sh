#!/bin/bash

number=4

is_odd_or_even() {
  local num=$1

  if [ $((num % 2)) -eq 0 ]; then
    echo "$num is an even number."
  else
    echo "$num is an odd number."
  fi
}

is_odd_or_even $number
