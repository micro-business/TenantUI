FROM microbusiness/uihost-service
MAINTAINER micro.business.limited@gmail.com
ADD resources/public/prod/js/main.js /www/js/
CMD ["/UIHostService"]