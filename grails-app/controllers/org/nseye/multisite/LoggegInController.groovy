package org.nseye.multisite

import grails.plugin.springsecurity.annotation.Secured

class LoggegInController {
  @Secured('ROLE_ADMIN')
  def index() {
    render 'Secure access only'
  }
}
