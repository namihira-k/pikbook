"use strict";
var root = window;

root.app = {
    start: function( ) {
        new Vue({
            el: '#js-home-picture-list',
            data: {
              pictures: []
            },
            created: function () {
                this._fetch()
            },
            methods: {
              _fetch: function () {
                var that = this;
                var targetUrl = '/pikbook/api/pictures';
                $.ajax({
                  type : 'GET',
                  url : targetUrl,
                  dataType : 'json',
                  success : function(data) {
                    that.$set('pictures', data);
                  }
                });
              }
            }
        })
    }
};

